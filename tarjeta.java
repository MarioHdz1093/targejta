
public class tarjeta
{
    // instance variables - replace the example below with your own
    private float saldo;

    public tarjeta()
    {
        // initialise instance variables
        saldo = 0;
    }
    
    public void depositar(float dinero)
    {
        // put your code here
        saldo = saldo + dinero;
    }
    
    public float retirar(float dinero)
    {
        if (saldo>=dinero){
        }
        return dinero;
    }
}
