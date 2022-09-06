public class Ikdvndskf{

    public double calcularIva (double precio, String tipoProducto) throws Exception {
        double IVA=0;
       
        if(precio<0){
            throw new Exception("El valor no puede ser negativo");
        };

        if (tipoProducto.equals("basico")){
            IVA=precio+(precio*0.1);
        } else if (tipoProducto.equals("cultural")){
            IVA=precio;
        }else{
            IVA=precio+(precio*0.19);
        }

       
        return IVA;
    };
    
    
    public static void main(String[] args)
        {   
            try{
                double total = 0;
                Ikdvndskf clase = new Ikdvndskf();
                total = clase.calcularIva(-20000, "basico");
                System.out.println(total);
            }catch (Exception e){
                System.out.println(e);
            }
    };
    
}