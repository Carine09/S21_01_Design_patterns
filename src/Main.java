//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MangaFactory mangaFactory = new MangaFactory();

        Manga jujustsuKaisen = mangaFactory.createManga(TypeManga.SHONEN, "Jujutsu Kaisen","Itadori", "Yūji");
        Manga cardcaptorSakura = mangaFactory.createManga(TypeManga.SHOJO, "Cardcaptor Sakura", "Kinomoto", "Sakura");

        System.out.println(jujustsuKaisen.getDescription());
        System.out.println(cardcaptorSakura.getDescription());

        MainCharacter mainCharacter = new TwoMainCharacter(new MainCharacterImpl("Ōsaki","Nana"),"Komatsu","Nana");
        Manga nana = mangaFactory.createManga(TypeManga.SHOJO, "Nana", mainCharacter);
    }
}