package Esercizio1;

public class Word {
	String str;
	
	public Word(String _str) {
		this.str = _str;
	}

	
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Word other = (Word) obj;
        return this.str.equalsIgnoreCase(other.str);
    }
	
	
	@Override
    public int hashCode() {
        return this.str.toLowerCase().hashCode();
    }
	
	@Override
    public String toString() {
        return this.str;
    }
	
	
}
