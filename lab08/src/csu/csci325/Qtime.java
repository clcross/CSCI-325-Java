/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cameron Cross
 */
public class Qtime
{
    private List<QtimeNote> qNoteList;
    
    public Qtime()
    {
        qNoteList = new LinkedList<>();
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
        Iterator<QtimeNote> noteRemove = qNoteList.iterator();
        
        while(noteRemove.hasNext())
        {
            if(noteRemove.next().bibBook.equals(book))
            {
                noteRemove.remove();
            }
        }
    }
    
    public void updateUserNote(QtimeNote qtimeNote, String userNotes)
    {
        qtimeNote.updateUserNotes(userNotes);
    }
    
    public void sortNotes()
    {
        Collections.sort(qNoteList);
    }
}
