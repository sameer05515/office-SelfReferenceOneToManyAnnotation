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
@Table(name="EXAMPLE")
public class Example {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORD_ID", nullable = false)
	private Word word;
	
	@Column(name="EXAMPLE")
	private String example;

	/**
	 * @param id
	 * @param word
	 * @param example
	 */
	public Example(int id, Word word, String example) {
		super();
		this.id = id;
		this.word = word;
		this.example = example;
	}

	/**
	 * 
	 */
	public Example() {
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
	 * @return the example
	 */
	public String getExample() {
		return example;
	}

	/**
	 * @param example the example to set
	 */
	public void setExample(String example) {
		this.example = example;
	}

	/**
	 * @param example
	 */
	public Example(String example) {
		super();
		this.example = example;
	}

}
