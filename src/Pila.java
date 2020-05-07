public class Pila {
    private Nodo head;

    public Pila(){
        head=null;
    }

    public Nodo creaNodo(Invitato persona,Nodo link){
        Nodo newNodo=new Nodo(persona);
        newNodo.setLink(link);
        return newNodo;
    }

    public void push(Invitato persona){
        Nodo p;
        p=creaNodo(persona,head);
        head=p;
    }

    public Invitato pop(){
        Nodo p;
        if (head==null)
            return null;    //La lista è vuota
        p=head;             //Se lo conserva
        head=head.getLink();//Scatta all'elemento successivo, eliminando il primo
        return p.getInfo(); //Stampa quello conservato
    }

    public String toString(){
        Nodo p=head;
        String pila = "head ->";
        if (p==null)
            return pila+" null";    //Se la lista è vuota

        while (p!=null) {
            pila=pila+"["+p.getInfo().toString()+"|";
            if (p.getLink()==null)
                pila=pila+"null]";
            else
                pila=pila+"+]-->";
            p=p.getLink();
        }
        return pila;
    }
}