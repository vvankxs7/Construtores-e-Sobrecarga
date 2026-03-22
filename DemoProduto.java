public class DemoProduto{
    public static void main(String[] args){
        Produto c1 = new Produto("Cauê","060.060.160-7");
        Produto c2 = new Produto("Fernanda","160.717.042-5");
        Produto c3 = new Produto();
        
        System.out.println("Cliente 1:"+c1);
        System.out.println("Cliente 2:"+c2);
        System.out.println("Cliente 3:"+c3);
    }
}