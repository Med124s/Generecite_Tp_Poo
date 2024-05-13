Exercice 1 :
On souhaite créer une classe générique appelée StorageGenerique qui peut stocker des
éléments de n'importe quel type. La classe devrait avoir un attribut nommé elements de type
List pour stocker les éléments. Ajouter à la classe StorageGenerique les méthodes
suivante :
- Public void addElement(T o) : permettant d'ajouter un élément à la collection.
- public T getElement(int index) : permettant de récupérer un élément à une position
donnée dans la collection.
- public void removeElement(int index) permettant de supprimer un élément
spécifique de la collection.
- public int getSize() permettant d'obtenir la taille actuelle de la liste.
Créez une classe de test appelée App pour tester votre implémentation. Utilisez la classe
StorageGenerique avec différents types (par exemple, Integer, String, Double). Effectuez
des opérations d'ajout, de récupération, de suppression et de vérification sur la liste générique.

Exercice 2 :
L’objectif de cet exercice est d’utiliser la généricité avec une collection d'objets de type
produit .
- Créez une classe Produit avec les attributs id, nom, marque, prix, description,
et nombre en stock.
- Créer une Interface générique IMetier qui va déclarer les méthodes pour gérer
nos entités Produit. Cette interface a un type générique T et contient les
méthodes suivantes :
o public void add(T o) : qui permet d’ajouter un objet à la liste.
o public List<T> getAll() : qui retourne la liste des objets sous forme d’une
liste.
o public T findById(long id) : qui retourne un produit par id.
o public void delete(long id) : qui supprime un objet par id.

- Créer une classe MetierProduitImpl qui implémente l’interface IMetier. Cette classe
contient un attribut qui représente une liste de produits.
- Ecrire une classe Application contenant la méthode main qui propose à l’utilisateur
dans une boucle while le menu suivant :
1. Afficher la liste des produits.
2. Rechercher un produit par son id.
3. Ajouter un nouveau produit dans la liste.
4. Supprimer un produit par id.
5. Quitter ce programme.
