public class TVSet {

	private int channel;
	private int volume;
	private boolean on;

	TVSet() {
		this.setChannel(1);
		this.setVolume(50);
		this.setOn(false);
	}

	TVSet(int channel, int volume, boolean on) {
		this.setChannel(channel);
		this.setVolume(volume);
		this.setOn(on);
	}

	public void printStatus() {
		System.out.println("TVSet Status:");
		System.out.println("On: " + this.isOn());
		System.out.println("Channel: " + this.getChannel());
		System.out.println("Volume: " + this.getVolume());
		System.out.println();
	}

	public void changeVolume(int value) {
		if(this.isOn())
			this.setVolume(Math.max(Math.min(this.getVolume()+value, 100), 0));
		else
			System.out.println("TV is off.");

		this.printStatus();
	}

	public void volumeUp() {
		this.changeVolume(5);
	}

	public void volumeDown() {
		this.changeVolume(-5);
	}

	public void changeChannel(int value) {
		if(this.isOn())
			this.setChannel(Math.max(Math.min(this.getChannel()+value, 100), 0));
		else
			System.out.println("TV is off.");

		this.printStatus();
	}

	public void channelUp() {
		this.changeChannel(1);
	}

	public void channelDown() {
		this.changeChannel(-1);
	}

	public void turnOn() {
		this.setOn(true);
	}

	public void turnOff() {
		this.setOn(false);
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getChannel() {
		return this.channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean isOn() {
		return this.on;
	}

	public static void main(String[] args) {
		TVSet fernsehen = new TVSet(1, 20, false);

		fernsehen.printStatus();

		fernsehen.volumeDown();
		fernsehen.channelUp();
		fernsehen.channelUp();
		fernsehen.channelUp();
		fernsehen.channelDown();
		fernsehen.channelDown();

		fernsehen.turnOff();

		fernsehen.channelUp();
		fernsehen.channelDown();
		fernsehen.volumeUp();
		fernsehen.volumeDown();
	}
}