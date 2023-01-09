class Todo {
    private var tasks = arrayOf<Task>()

    fun showAllTasks() {
        if (tasks.isEmpty()) {
            println("\nSorry, the array is empty..\n")
            return
        }
        println()
        for (task in tasks) {
            println("$task")
        }
        println()
    }

    fun printSpecificTaskById(id: Int) {
        for (task in tasks) {
            if (task.id == id) {
                println("\n$task\n")
                return
            }
        }
        println("\nSorry, there is not a task with id=$id in the array..\n")
    }

    fun printSpecificTaskByPosition(position: Int) {
        if (position in tasks.indices) {
            println("\n${tasks[position]}\n")
            return
        }
        println("\nThere is not a task at position = $position\n")
    }

    fun addTask(task: Task) {
        tasks += task
        println("\nThe item added to the array successfully..\n")
    }

    fun removeTask(task: Task) {
        for (i in tasks.indices) {
            if (task == tasks[i]) {
                val temp = tasks.toMutableList()
                temp.removeAt(i)
                tasks = temp.toTypedArray()
                println("\nThe item removed from the array successfully..\n")
                return
            }
        }
        println("\nSorry, the task which entered is not found in the array..\n")
    }

    fun changeTask(task: Task) {
        for (i in tasks.indices) {
            if (tasks[i].id == task.id) {
                tasks[i] = task
                println("\nThe item changed successfully..\n")
                return
            }
        }
        println("\nSorry, there is not a task with id=${task.id} to change..\n")
    }
}