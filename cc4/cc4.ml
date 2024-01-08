type traitement = 
  | Nettoyage
  | Plombage
  | Extraction
  | Consultation


let compter_traitement liste_traitement traitement_recherche =
  List.fold_left (fun compteur traitement_courant ->
      if traitement_courant = traitement_recherche then compteur + 1 else compteur) 0 liste_traitement



let filtrer_rendez_vous_par_traitement liste_rendez_vous traitement_recherche = 
  List.filter (fun traitement -> traitement = traitement_recherche) liste_rendez_vous


type rendez_vous = { date: string; traitement: traitement }

let trier_rendez_vous_par_date liste_rendez_vous =
  List.sort (fun rdv1 rdv2 -> compare rdv1.date rdv2.date) liste_rendez_vous



let verifier_disponibilite date_recherchee liste_rendez_vous =
  not (List.exists (fun rdv -> rdv.date = date_recherchee) liste_rendez_vous)



let test_compter_traitement = 
  let traitements = [Nettoyage; Plombage; Extraction; Nettoyage; Consultation] in
  compter_traitement traitements Nettoyage = 2



let test_trier_rendez_vous = 
  let rendez_vous = [{date="2023-01-02"; traitement=Plombage}; {date="2023-01-01"; traitement=Nettoyage}] in
  let tries = trier_rendez_vous_par_date rendez_vous in
  List.hd tries = {date="2023-01-01"; traitement=Nettoyage}

let test_verifier_disponibilite = 
  let rendez_vous = [{date="2023-01-01"; traitement=Nettoyage}] in
  verifier_disponibilite "2023-01-02" rendez_vous
      



