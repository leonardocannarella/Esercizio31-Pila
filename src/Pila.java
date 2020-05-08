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
        Nodo p;                                 //Dichiari un puntatore p di tipo Nodo
        p=creaNodo(persona,head);               //Creo il nodo e lo assegno al puntatore
        head=p;                                 //Head punta al nodo creato
    }

    public Invitato pop(){
        Nodo p;
        if (head==null)
            return null;                        //La lista è vuota
        p=head;                                 //Se lo conserva
        head=head.getLink();                    //Scatta all'elemento successivo, eliminando il primo
        return p.getInfo();                     //Stampa quello conservato
    }

    public String toString(){
        Nodo p=head;
        String risultato = "head ->";
        if (p==null)
            return risultato+" null";                //Se la lista è vuota

        while (p!=null) {
            risultato=risultato+"["+p.getInfo().toString()+"|";
            if (p.getLink()==null)
                risultato=risultato+"null]";
            else
                risultato=risultato+"+]-->";
            p=p.getLink();
        }
        return risultato;
    }
}