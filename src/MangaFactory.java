public class MangaFactory {
    public Manga createManga(TypeManga var1, String var2, String var3, String var4) {
        switch (var1) {
            case SHONEN -> {
                return new Shonen(var2, new MainCharacterImpl(var3, var4));
            }
            case SHOJO -> {
                return new Shojo(var2, new MainCharacterImpl(var3, var4));
            }
            default -> throw new IllegalArgumentException("Type de manga non supporté: " + var1.name());
        }
    }
}
