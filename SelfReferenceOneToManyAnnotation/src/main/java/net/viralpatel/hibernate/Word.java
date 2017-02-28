package net.viralpatel.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WORD")
public class Word {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@Column(name="WORD")
	private String word;
	
	@Column(name="TYPE")
	private String type;

	/**
	 * 
	 */
	public Word() {
		super();
	}

	/**
	 * @param id
	 * @param word
	 */
	public Word(int id, String word) {
		super();
		this.id = id;
		this.word = word;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param word
	 * @param type
	 */
	public Word(String word, String type) {
		super();
		this.word = word;
		this.type = type;
	}
	
	

}
