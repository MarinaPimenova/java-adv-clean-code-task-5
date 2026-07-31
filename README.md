# Employee Payroll System: Refactoring for Extensibility

This project demonstrates a transition from a legacy `switch`-based logic to a clean, **Open-Closed Principle (OCP)** compliant architecture using Java 21. By leveraging polymorphism, we've eliminated the need to modify core logic when adding new employee types.

## 🛠 Environment & Requirements

* **JDK:** 21 (uses modern Java features like `sealed` classes where applicable)
* **Build Tool:** Maven/Gradle (standard Java structure)
* **Paradigm:** Object-Oriented Programming (Polymorphism)

## 🏗 Architecture Overview

The core of this refactor replaces a central `switch` statement with a class hierarchy. This ensures that the system is **open for extension** (new employee types) but **closed for modification** (existing calculation logic).

### Before Refactoring (The Problem)

```java
// Logic was coupled and fragile
public double calculatePay() {
    return switch (type) {
        case HOURLY -> rate * hours;
        case SALARIED -> salary;
        // Adding a new type required changing this file
    };
}

```

### After Refactoring (The Solution)

The logic is now distributed across specific implementations, making the code more maintainable and testable.

| Class | Responsibility |
| --- | --- |
| `Employee` | **Abstract Base**: Defines the contract for pay and bonuses. |
| `HourlyEmployee` | Handles wage calculations based on hours worked. |
| `SalariedEmployee` | Handles fixed monthly/annual salary logic. |
| `CommissionedEmployee` | Handles base pay plus sales-based commissions. |

---

## 🚀 Implementation Details

### 1. The Employee Hierarchy

The base `Employee` class provides the common structure while forcing subclasses to define their own financial logic.

```java
public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculatePay();
    public abstract double calculateBonus();
    
    // Getters...
}

```

### 2. Specialized Subclasses

Each class implements the `calculatePay()` and `calculateBonus()` methods based on its specific business rules. For example, the `CommissionedEmployee` factors in sales volume, while the `HourlyEmployee` might include overtime logic.

---

## 🧪 Testing

Unit tests are located in `src/test/java` and cover:

* **Accuracy:** Ensuring  for hourly staff.
* **Edge Cases:** Validating bonus calculations for employees with zero sales in the commission model.
* **Type Safety:** Ensuring the client code handles the `Employee` abstraction correctly.

## 🏃 How to Run

1. **Clone the repo:**
```bash
git clone https://github.com/MarinaPimenova/java-adv-clean-code-task-5.git

```


2. **Compile:**
```bash
javac -d out src/main/java/**/*.java

```


3. **Run Tests:**
```bash
# If using Maven
mvn test

```
