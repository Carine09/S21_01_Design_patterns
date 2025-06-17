### Exercice 1
Pour simplifie la création d’un manga, nous voulons créer une fabrique qui se charge de construire tout les éléments nécessaires.

Utilise le patternFactory pour écrire la classe MangaFactory.

Le code suivant devra afficher le résultat ci après:

MangaFactory mangaFactory = new MangaFactory();

Manga jujustsuKaisen = mangaFactory.createManga(TypeManga.SHONEN, "Jujutsu Kaisen","Itadori", "Yūji");
Manga cardcaptorSakura = mangaFactory.createManga(TypeManga.SHOJO, "Cardcaptor Sakura", "Kinomoto", "Sakura");

System.out.println(jujustsuKaisen.getDescription());
System.out.println(cardcaptorSakura.getDescription());

### Exercice 2
Certains mangas ont deux personnages principaux ! Utilise le pattern Décorateur sur la classe MainCharacter permettant de gérer ce cas.

Le code suivant devra afficher le résultat ci après :

MainCharacter mainCharacter = new TwoMainCharacter(new MainCharacterImpl("Ōsaki","Nana"),"Komatsu","Nana");
Manga nana = mangaFactory.createManga(TypeManga.SHOJO, "Nana", mainCharacter);

Ce shojo s'appel Nana et son personnage principal est Nana Ōsaki ainsi que Nana Komatsu

### Exercice 3
Nous voulons sauvegarder ces mangas dans une base de données, mais ton leader technique n’a pas encore choisi quelle technologie utiliser ! Mets en place le pattern repository dans cette application, et crée une implémentation de ce repository qui ne permet que d’indiquer dans la console qu’un manga doit être sauvegardé
Si tu souhaites aller plus loin, tu peux par la suite remplacer cette implémentation par une nouvelle qui permet d’effectuer la sauvegarde dans une base de données.