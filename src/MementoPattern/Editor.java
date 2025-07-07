package MementoPattern;

public class Editor {
    private String content;
    public Editor() {
        content = "";
    }
    public void type(String text) {
        content += text;
    }
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}
