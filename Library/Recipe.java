package Library;

public class Recipe {
    //pola
    private String title;
    private String składnikiPodstawowe;
    private String składnikiPomocnicze;
    private String poziomTrudności;
    private int czasPrzygotowania;
    private String sposóbPrzygotowania;

    //konstruktory
    public Recipe(String title, String składnikiPodstawowe, String składnikiPomocnicze, String poziomTrudności, int czasPrzygotowania,
                  String sposóbPrzygotowania) {
        this(title, składnikiPodstawowe, składnikiPomocnicze, poziomTrudności, sposóbPrzygotowania);
        this.czasPrzygotowania = czasPrzygotowania;
    }

    public Recipe(String title, String składnikiPodstawowe, String składnikiPomocnicze, String poziomTrudności, String sposóbPrzygotowania) {
        this.title = title;
        this.składnikiPodstawowe = składnikiPodstawowe;
        this.składnikiPomocnicze = składnikiPomocnicze;
        this.poziomTrudności = poziomTrudności;
        this.sposóbPrzygotowania = sposóbPrzygotowania;
    }
    //setteri i gettery
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getSkładnikiPodstawowe(){
        return składnikiPodstawowe;
    }
    public void setSkładnikiPodstawowe(String składnikiPodstawowe){
        this.składnikiPodstawowe = składnikiPodstawowe;
    }
    public String getSkładnikiPomocnicze(){
        return składnikiPomocnicze;
    }
    public void setSkładnikiPomocnicze(String składnikiPomocnicze){
        this.składnikiPomocnicze = składnikiPomocnicze;
    }
    public String getPoziomTrudności(){
        return poziomTrudności;
    }
    public void setPoziomTrudności(String poziomTrudności){
        this.poziomTrudności = poziomTrudności;
    }
    public int getCzasPrzygotowania(){
        return czasPrzygotowania;
    }
    public void setCzasPrzygotowania(int czasPrzygotowania){
        this.czasPrzygotowania = czasPrzygotowania;
    }
    public String getSposóbPrzygotowania(){
        return sposóbPrzygotowania;
    }
    public void setSposóbPrzygotowania(String sposóbPrzygotowania){
        this.sposóbPrzygotowania = sposóbPrzygotowania;
    }

    //wyświetlanie informacji o przepisie
    public void printInfo(){
        String info = title+"; "+składnikiPodstawowe+"; "+składnikiPomocnicze+"; "+poziomTrudności+"; "+czasPrzygotowania+"; "
                +sposóbPrzygotowania;
        if (czasPrzygotowania != 0){
        info = info + "; "+czasPrzygotowania;
            System.out.println(info);
        }
    }

}
