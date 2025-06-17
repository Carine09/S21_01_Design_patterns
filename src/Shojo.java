public class Shojo extends Manga{
    public Shojo(String titre, MainCharacter mainCharacterPrincipal) {
        this.titre = titre;
        this.mainCharacterPrincipal = mainCharacterPrincipal;
    }

    @Override
    public String getStringType(){
        return "shojo";
    }
}
