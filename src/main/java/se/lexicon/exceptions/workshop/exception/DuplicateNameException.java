package se.lexicon.exceptions.workshop.exception;

public class DuplicateNameException extends Exception
{
    private final String duplicateName;

    public DuplicateNameException(String duplicateName, String message)
    {
        super(message);
        this.duplicateName = duplicateName;
    }

    public String getDuplicateName()
    {
        return duplicateName;
    }
}
