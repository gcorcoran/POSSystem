/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

/**
 *
 * @author gcorcoran
 */
public class FakeDB implements DataStorageStrategy{
    
     Product items[] = {new Product("A100",10,"Kitten",new FlatDiscount(2.111)),
                        new Product("A101",15,"Dog   ",new NoDiscount(3)),
                        new Product("A102",20,"Ferret",new BuyOneGetOneFreeDiscount(4)),
                        new Product("A103",25,"Wombat",new PercentDiscount(5)),
                        new Product("A104",30,"Snake ",new FlatDiscount(6)),
                        new Product("A105",35,"Bird  ",new NoDiscount(7)),
                        new Product("A106",40,"Parrot",new BuyOneGetOneFreeDiscount(8)),
                        new Product("A107",45,"Eagle ",new NoDiscount(8)),
                        new Product("A108",50,"Tiger ",new FlatDiscount(7)),
                        new Product("A109",55,"Bear  ",new PercentDiscount(6)),
                        new Product("A110",60,"Boar  ",new BuyOneGetOneFreeDiscount(5)),
                        new Product("A111",65,"Ox    ",new NoDiscount(4)),
                        new Product("A112",70,"Lion  ",new FlatDiscount(3)),
                        new Product("A113",75,"Monkey",new BuyOneGetOneFreeDiscount(2)),
                        new Product("Z999",00,"999999",new NoDiscount(1)),
                        
            };



    
     @Override
        public Product getProductInfo(String upc) {
       
        Product product = null;
        for(Product p : items) {
            if(upc.equals(p.getUPC())) {
                product = p;
                break;
            }
        }
        
        return product;
    }

    }
    
     
     

