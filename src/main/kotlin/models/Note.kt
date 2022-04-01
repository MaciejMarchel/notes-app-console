package models

data class Note(var noteTitle: String,
                var notePriority: Int,
                var noteCategory: String,
                var noteStatus: String,
                var isNoteArchived :Boolean){
}

//New Field Status