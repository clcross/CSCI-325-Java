/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cameron Cross
 */
public class Qtime
{
    List<QtimeNote> qNoteList;
    public Qtime()
    {
        qNoteList = new LinkedList<>();
        qNoteList.clear();
    }
    
    public List<QtimeNote> getNoteList()
    {
        return qNoteList;
    }
    
    public int getNoteListSize()
    {
        return qNoteList.size();
    }
    
    public void setNote(QtimeNote qtimeNote)
    {
        qNoteList.add(qtimeNote);
    }
    
    public void removeNotes(String book)
    {
        qNoteList.remove(book);
    }
    
    public void updateUserNote(QtimeNote qTimeNote, String userNotes)
    {
        qTimeNote.updateUserNotes(userNotes);
    }
    
    public void sortNotes()
    {
        //qNoteList = qNoteList.sort();
    }
}
