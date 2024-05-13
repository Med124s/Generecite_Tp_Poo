package org.enset.Model.Ex2;
import java.util.ArrayList;
import java.util.List;
public class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> produits;

    public MetierProduitImpl() {
        this.produits = new ArrayList<>();
    }
    @Override
    public void add (Produit o){
        produits.add(o);
    }

    @Override
    public List<Produit> getAll () {
        return produits;
    }

    @Override
    public Produit findById ( long id){
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null; // Si le produit n'est pas trouvé
    }

    @Override
    public void delete ( long id){
        produits.removeIf(produit -> produit.getId() == id);
    }
}