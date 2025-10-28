package JAVA25.Level16_Inner_Nested;

public class Lecture2_3 {
    private Link head;
    private static class Link {
        int value;
        Link next;

        public Link(int value) {
            this.value = value;
        }
    }

    void addArtifact(int artifactValue) {
        Link link = new Link(artifactValue);
        link.next = head;
        head = link;
    }

    void displayChain() {
        Link current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;

        }
    }

    static void main(String[] args) {
        Lecture2_3 artfacteCain = new Lecture2_3();
        artfacteCain.addArtifact(10);
        artfacteCain.addArtifact(20);
        artfacteCain.addArtifact(30);

        artfacteCain.displayChain();
    }
}
