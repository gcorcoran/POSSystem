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
    
     Product items[] = {new Product("A100",10,"Kitten",new FlatDiscount(2)),
                        new Product("A101",15,"Dog   ",new NoDiscount(15)),
                        new Product("A102",20,"Ferret",new BuyOneGetOneFreeDiscount(20)),
                        new Product("A103",25,"Wombat",new PercentDiscount(25)),
                        new Product("A104",30,"Snake ",new FlatDiscount(2)),
                        new Product("A105",35,"Bird  ",new NoDiscount(35)),
                        new Product("A106",40,"Parrot",new BuyOneGetOneFreeDiscount(40)),
                        new Product("A107",45,"Eagle ",new NoDiscount(45)),
                        new Product("A108",50,"Tiger ",new FlatDiscount(2)),
                        new Product("A109",55,"Bear  ",new PercentDiscount(55)),
                        new Product("A110",60,"Boar  ",new BuyOneGetOneFreeDiscount(60)),
                        new Product("A111",65,"Ox    ",new NoDiscount(65)),
                        new Product("A112",70,"Lion  ",new FlatDiscount(2)),
                        new Product("A113",75,"Monkey",new BuyOneGetOneFreeDiscount(75)),
                        new Product("Z999",00,"999999",new NoDiscount(0)),
                        
            };



    public String getUPC(int a) {
        return items[a].getUPC();
    }
    
    public Product getProductInfo(int a) {
        return items[a];
    }
    
    }
    
     
     

