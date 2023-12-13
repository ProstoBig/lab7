package lab7;

/**
 * Представляє музичний інструмент.
 */
abstract class MusicalInstrument {
    String name;
    String sound;

    /**
     * Конструктор для MusicalInstrument.
     * @param name Назва музичного інструменту.
     * @param sound Звук, що виробляє музичний інструмент.
     */
    public MusicalInstrument(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    /**
     * Абстрактний метод для відтворення музичного інструменту.
     */
    abstract void play();
}

/**
 * Представляє струнний музичний інструмент.
 */
class StringInstrument extends MusicalInstrument {
    int numberOfStrings;

    /**
     * Конструктор для StringInstrument.
     * @param name Назва музичного інструменту.
     * @param sound Звук, що виробляє музичний інструмент.
     * @param numberOfStrings Кількість струн.
     */
    public StringInstrument(String name, String sound, int numberOfStrings) {
        super(name, sound);
        this.numberOfStrings = numberOfStrings;
    }

    /**
     * Перевизначений метод для відтворення звуку струнного інструменту.
     */
    @Override
    void play() {
        System.out.println(name + " з " + numberOfStrings + " струнами " + sound);
    }
}

/**
 * Представляє духовий музичний інструмент.
 */
class WindInstrument extends MusicalInstrument {
    String material;

    /**
     * Конструктор для WindInstrument.
     * @param name Назва музичного інструменту.
     * @param sound Звук, що виробляє музичний інструмент.
     * @param material Матеріал, з якого зроблений інструмент.
     */
    public WindInstrument(String name, String sound, String material) {
        super(name, sound);
        this.material = material;
    }

    /**
     * Перевизначений метод для відтворення звуку духового інструменту.
     */
    @Override
    void play() {
        System.out.println(name + " зроблений(а) з " + material + " " + sound);
    }
}

/**
 * Представляє гітару як струнний інструмент.
 */
class Guitar extends StringInstrument {
    public Guitar() {
        super("гітара", "робить звук гітари", 7);
    }
}

/**
 * Представляє трубу як духовий інструмент.
 */
class Trumpet extends WindInstrument {
    public Trumpet() {
        super("труба", "робить звук труби", "бронзи");
    }
}