public class Shonen extends Manga{
    public Shonen(String titre, MainCharacter mainCharacterPrincipal) {
        this.titre = titre;
        this.mainCharacterPrincipal = mainCharacterPrincipal;
    }

    @Override
    public String getStringType(){
        return "shonen";
    }
}
