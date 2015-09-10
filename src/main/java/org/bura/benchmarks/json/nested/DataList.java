package org.bura.benchmarks.json.nested;

import java.util.List;

public class DataList {
    private String _rev;
    private String dateModified;
    private String title;
    private String _id;
    private String description;
    private String dateCreated;
    private String pouchname;
    private List<String> comments;
    private List<String> datumIds;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<String> getDatumIds() {
        return datumIds;
    }

    public void setDatumIds(List<String> datumIds) {
        this.datumIds = datumIds;
    }
}
      
      
