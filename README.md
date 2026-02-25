# Student Management System

A Java console application for managing students and instructors.

---

## Getting Started

Fork this repository, clone your fork, and open the project in your IDE.

---

## Your Task

Create a folder with your name under `src/main/java/students/` and build out the following class structure inside it:

**`Person`** — base class
- Fields: `id`, `firstName`, `lastName`, `email`
- Method: `getSummary()`

**`Student`** extends `Person`
- Additional fields: `gradeLevel`, `gpa`
- Methods: `getSummary()`, `isOnHonorRoll()`

**`Instructor`** extends `Person`
- Additional fields: `department`
- Methods: `getSummary()`, `createAnnouncement(String message)`

**`Instructor`** should also be able to hold a list of assigned `Student` objects with the ability to add students and print a roster.

```
Dr. Rivera's Roster:
  - Jordan Smith | Grade Level: 2 | GPA: 3.8
  - Marcus Brown | Grade Level: 1 | GPA: 2.9
```

In your `Main` class, create a mix of `Student` and `Instructor` objects, store them in a single list, and print each one's summary.

---

## Example Output

```
[Student] Jordan Smith | Grade Level: 2 | GPA: 3.8 | Honor Roll: Yes
[Student] Marcus Brown | Grade Level: 1 | GPA: 2.9 | Honor Roll: No
[Instructor] Dr. Rivera | Department: Computer Science
```

---

## Stretch Goal

Create a **`School`** class that holds a list of `Student` objects and a list of `Instructor` objects. It should support adding both and printing a full directory.

---

## Requirements

- All fields must be private
- All classes require a constructor
- `Person` must be abstract
- `getSummary()` must be overridden in each subclass
- No `instanceof` checks in your loop

---

## Submitting

1. Push your work to your forked repository
2. Open a pull request back to the org repo
3. Title your PR: `Firstname Lastname - Student Management System`
