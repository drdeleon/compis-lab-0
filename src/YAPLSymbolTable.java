import java.util.HashMap;

public class YAPLSymbolTable {
    private HashMap<String, YAPLSymbol> symbols;
    private String scope;

    public YAPLSymbolTable(String scope) {
        this.symbols = new HashMap<String, YAPLSymbol>();
        this.scope = scope;
    }

    public void add(YAPLSymbol symbol) {
        this.symbols.put(symbol.getId(), symbol);
    }

    public String getScope() {
        return scope;
    }

    public YAPLSymbol remove(String id) {
        return this.symbols.remove(id);
    }

    public boolean lookup(String id) {
        return this.symbols.containsKey(id) ? true : false;
    }
}