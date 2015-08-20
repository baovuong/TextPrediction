import java.util.Map;

public class MarkovState<T> {
	private T value;
	private Map<MarkovState<T>,Double> probabilities;
	
	public MarkovState() {
		this(null);
	}
	
	public MarkovState(T value) {
		this.value = value;
	}
	
	
	public MarkovState<T> nextState(double prob) {
		return null;
	}
	
	public MarkovState<T> nextState() {
		return null;
	}
	
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}
