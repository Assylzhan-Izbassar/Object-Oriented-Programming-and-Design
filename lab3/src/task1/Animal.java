package task1;

public abstract class Animal {
	
	protected String type;
	protected String voice;
	protected String food;
	/**
	 * Empty constructor*/
	public Animal() {
		
	}
	/**
	 * Constructor
	 * @param String type*/
	public Animal(String type) {
		this.type = type;
	}
	/**
	 * Constructor
	 * @param String type, String voice*/
	public Animal(String type, String voice) {
		this(type);
		this.voice = voice;
	}
	/**
	 * Constructor
	 * @param String type,String voice, String food*/
	public Animal(String type, String voice, String food) {
		this(type, voice);
		this.food = food;
	}
	/**
	 * Getter of "type" field*/
	public String getType() {
		return this.type;
	}
	/**
	 * Setter of the "type" field
	 * @param String type*/
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Getter of "voice" field*/
	public String getVoice() {
		return this.voice;
	}
	/**
	 * Setter of the "voice" field
	 * @param String voice*/
	public void setVoice(String voice) {
		this.voice = voice;
	}
	/**
	 * Getter of "food" field*/
	public String getFood() {
		return this.food;
	}
	/**
	 * Setter of the "food" field
	 * @param String food*/
	public void setFood(String food) {
		this.food = food;
	}
	
}
