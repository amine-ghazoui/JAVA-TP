package exercice_1;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier <Produit>{

    private List<Produit> listProduits ;

    public MetierProduitImpl() {
        this.listProduits = new ArrayList<>();
    }

    @Override
    public void add(Produit o) {
        listProduits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        List<Produit> listProd = new ArrayList<>();
        for (Produit prod : listProduits) {
            listProd.add(prod);
        }
        return listProd;
    }

    @Override
    public Produit findById(long id) {
        Produit p = null;
        for (Produit prod : listProduits) {
            if (prod.getId() == id){
                p = prod;
            }
        }
        return p;
    }

    @Override
    public void delete(long id) {
        listProduits.removeIf(produit -> produit.getId() == id);
    }
}
