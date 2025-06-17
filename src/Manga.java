public abstract class Manga {
    protected String titre;
    protected MainCharacter mainCharacterPrincipal;

    public String getTitre() {
        return titre;
    }

    public MainCharacter getPersonnagePrincipal() {
        return mainCharacterPrincipal;
    }

    public String getStringType(){
        return "manga";
    }
    public String getDescription(){
        return String.format("Ce %s s'appel %s et son personnage principal est %s", getStringType(),titre, mainCharacterPrincipal.getFullName());
    }
}
