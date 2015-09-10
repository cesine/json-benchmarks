package org.bura.benchmarks.json.nested;

import java.util.List;


public class Session {
    private String _rev;
    private String dateModified;
    private List<DatumField> sessionFields;
    private String _id;
    private String dateCreated;
    private String pouchname;
    private List<String> comments;

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public List<DatumField> getSessionFields() {
        return sessionFields;
    }

    public void setSessionFields(List<DatumField> sessionFields) {
        this.sessionFields = sessionFields;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPouchname() {
        return pouchname;
    }

    public void setPouchname(String pouchname) {
        this.pouchname = pouchname;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
      
