public class ToUpperLogic implements ButtonLogic, Sizeable {

	@Override
	public String getButtonLabel() {
		return "In Großbuchstaben umwandeln";
	}

	@Override
	public String eval(String x) {
		return x.toUpperCase();
	}
	private int w;
	private int h;
	
	@Override
	public void setSize(int width, int height) {
		w=width;
		h=height;
	}

	@Override
	public int getWidth() {
		return w;
	}

	@Override
	public int getHeight() {
		return h;
	}

}
