public class Nodo {
    private Invitato info;
    private Nodo link;

    public Nodo (Invitato persona)
    {
        info=persona;
        link=null;
    }

    public void setInfo(Invitato persona){
        info=persona;
    }

    public Invitato getInfo(){
        return info;
    }

    protected void setLink(Nodo link){
        this.link=link;
    }

    public Nodo getLink(){
        return link;
    }
}