class TextEditor {
    StringBuilder original;
    int cursor;
    public TextEditor() {
        original = new StringBuilder();
        cursor = 0;
    }
    
    public void addText(String text) {
        original.replace(cursor, cursor, text);
        cursor += text.length();
    }
    
    public int deleteText(int k) {
        if(k >= cursor){
            original.replace(0, cursor, "");
            int temp = cursor;
            cursor = 0;
            return temp;
        }
        else{
            original.replace(cursor - k, cursor, "");
            cursor -= k;
            return k;
        }
    }
    
    public String cursorLeft(int k) {
        cursor = Math.max(0, cursor - k);
        int len = Math.min(10, cursor);
        return original.substring(cursor - len, cursor);
    }
    
    public String cursorRight(int k) {
        cursor = Math.min(cursor + k, original.length());
        int len = Math.min(10, cursor);
        return original.substring(cursor - len, cursor);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */