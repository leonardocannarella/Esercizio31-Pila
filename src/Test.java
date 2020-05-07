public class Test {
    public static void main(String[] args) {
        Invitato i1=new Invitato("Bianchi Giovanni",'m',"0586 854822");
        Invitato i2=new Invitato("Rossi Marta",'f',"0586 844853");

        Pila p1=new Pila();
        p1.push(i1);
        p1.push(i2);
        System.out.println(p1.toString());

        Invitato inv=(p1.pop());
        if (inv==null)
            System.out.println("Pila p1 vuota");
        else
            System.out.println(inv);
        System.out.println(p1.toString());

        inv=(p1.pop());
        if (inv==null)
            System.out.println("Pila p1 vuota");
        else
            System.out.println(inv);
        System.out.println(inv.toString());
        System.out.println(p1.toString());

        inv=(p1.pop());
        if (inv==null)
            System.out.println("Pila p1 vuota");
        else
            System.out.println(inv);
    }
}
