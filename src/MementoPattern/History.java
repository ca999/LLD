package MementoPattern;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> editorMementos;
    History() {
        editorMementos = new Stack<>();
    }
    public void save(Editor editor) {
        editorMementos.push(editor.save());
    }
    public void restore(Editor editor) {
        editor.restore(editorMementos.pop());
    }
}
