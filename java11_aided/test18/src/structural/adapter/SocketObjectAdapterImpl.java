package structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	private Socket sock = new Socket();
	
	@Override
	public Volt get110Volt() {
		return sock.getVolt();
	}
	
	@Override
	public Volt get12Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 12);
	}

	@Override
	public Volt get9Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 9);
	}

	@Override
	public Volt get6Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 6);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getAmount()/i);
	}
}
