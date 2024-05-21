
import model.GetPoketraWithDetails;
import model.StockMp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hakim
 */
public class Main {
    public static void main(String[]args) throws Exception{
    String pf = "sac a dos";
    float pmin = 5;
    float pmax = 200;
//    System.out.println(GetPoketraWithDetails.RechercheP(pf, pmin, pmax));

        String err = "";
        try {
//            new StockMp().commandePoketra(1, 10);
//            System.out.println(StockMp.verifierStcokPf(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
