/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Date;

/**
 *
 * @author Cameron Cross
 */
public class QtimeNote implements Comparable<QtimeNote>
{
    public Date date;
    public String bibBook;
    public String bibVerse;
    public String bibNote;
    
    public QtimeNote(String book, String verse, String note)
    {
        bibBook = book;
        bibVerse = verse;
        bibNote = note;
        date = new Date();
    }
    
    @Override
    public int compareTo(QtimeNote n)
    {
        return bibBook.concat(bibVerse).compareTo(n.bibBook.concat(n.bibVerse));
    }
    
    public Date getDate()
    {
       return date; 
    }
    
    public String getBookOfBible()
    {
        return bibBook;
    }
    
    public String getVerseRef()
    {
        return bibVerse;
    }
    
    public String getUserNotes()
    {
        return bibNote;
    }
    
    public void updateUserNotes(String userNotes)
    {
        bibNote += userNotes;
    }
}