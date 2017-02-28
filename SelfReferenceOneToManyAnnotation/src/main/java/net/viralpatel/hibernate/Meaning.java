package net.viralpatel.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MEANING")
public class Meaning {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORD_ID", nullable = false)
	private Word word;
	
	@Column(name="MEANING")
	private String meaning;

	/**
	 * @param id
	 * @param word
	 * @param meaning
	 */
	public Meaning(int id, Word word, String meaning) {
		super();
		this.id = id;
		this.word = word;
		this.meaning = meaning;
	}

	/**
	 * 
	 */
	public Meaning() {
		super();
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
	public Word getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(Word word) {
		this.word = word;
	}

	/**
	 * @return the meaning
	 */
	public String getMeaning() {
		return meaning;
	}

	/**
	 * @param meaning the meaning to set
	 */
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	/**
	 * @param meaning
	 */
	public Meaning(String meaning) {
		super();
		this.meaning = meaning;
	}

}
