import java.util.HashMap;

class RnaTranscription {

    private static final HashMap<String, String> nucleotides = new HashMap<>();

    static {
        nucleotides.put("G", "C");
        nucleotides.put("C", "G");
        nucleotides.put("T", "A");
        nucleotides.put("A", "U");
    }

    String transcribe(String dnaStrand) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            stringBuilder.append(nucleotides.get(dnaStrand.substring(i, i + 1)));
        }
        return stringBuilder.toString();
    }
}
