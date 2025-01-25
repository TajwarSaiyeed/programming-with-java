<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Fundamentals Practice</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
            color: #333;
        }
        header {
            background-color: #4CAF50;
            color: white;
            padding: 1rem 0;
            text-align: center;
        }
        .container {
            max-width: 800px;
            margin: 2rem auto;
            padding: 1rem;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1, h2 {
            color: #4CAF50;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 0.5rem;
        }
        a {
            color: #4CAF50;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        code {
            background: #f4f4f4;
            padding: 0.2rem 0.4rem;
            border-radius: 4px;
            font-family: Consolas, monospace;
        }
        pre {
            background: #f4f4f4;
            padding: 1rem;
            border-radius: 8px;
            overflow-x: auto;
        }
    </style>
</head>
<body>
    <header>
        <h1>Java Fundamentals Practice</h1>
    </header>
    <div class="container">
        <p>
            This repository contains a collection of Java programs that demonstrate fundamental concepts in the Java programming language. It's intended for beginners who are learning Java and want to explore basic syntax, data types, operators, and other core features.
        </p>
        <h2>Files Included</h2>
        <ul>
            <li><a href="#ArithmeticExpressions">ArithmeticExpressions.java</a>: Examples demonstrating different arithmetic operations and how to construct arithmetic expressions in Java.</li>
            <li><a href="#Array">Array.java</a>: Shows how to declare, initialize, and manipulate single-dimensional arrays in Java.</li>
            <li><a href="#Casting">Casting.java</a>: Illustrates explicit and implicit type casting between different primitive data types.</li>
            <li><a href="#Constants">Constants.java</a>: Demonstrates how to declare and use constant variables in Java using the <code>final</code> keyword.</li>
            <li><a href="#Escape_Sequences">Escape_Sequences.java</a>: Provides examples of using escape sequences in strings for special characters.</li>
            <li><a href="#FormattingNumbers">FormattingNumbers.java</a>: Explores ways to format numbers (e.g., currency, percentages) for output.</li>
            <li><a href="#Main">Main.java</a>: This is a basic main method file that contains simple code.</li>
            <li><a href="#MathOperation">MathOperation.java</a>: Illustrates commonly used math functions provided by the Java standard library.</li>
            <li><a href="#MultiDimensionArray">MultiDimensionArray.java</a>: Shows how to create and work with multi-dimensional arrays.</li>
            <li><a href="#OrderOfOperations">OrderOfOperations.java</a>: Demonstrates the precedence of operators in Java expressions.</li>
            <li><a href="#Pri_Vs_Ref">Pri_Vs_Ref.java</a>: Compares primitive data types with reference types, specifically focusing on their way of storing data and variable assignation.</li>
            <li><a href="#Primitive_Types">Primitive_Types.java</a>: Examples of using all of the primitive data types, explaining their ranges, sizes, and default values.</li>
            <li><a href="#ReadInput">ReadInput.java</a>: Shows how to read input from the user using the <code>Scanner</code> class.</li>
            <li><a href="#Reference_Type">Reference_Type.java</a>: Explains the core of reference type, such as object initialization and object type variables.</li>
            <li><a href="#Strings">Strings.java</a>: Examples of how to create, compare, and manipulate Strings using the String class.</li>
            <li><a href="#Variable">Variable.java</a>: Demonstrates how to declare and use variables with different data types.</li>
            <li><a href="#ComparisonOperator">ComparisonOperator.java</a>: Examples of using comparison operators to compare values in Java.</li>
            <li><a href="#LogicalOperator">LogicalOperator.java</a>: Examples of using logical operators to combine multiple conditions in Java.</li>
            <li><a href="#TernaryOperator">TernaryOperator.java</a>: Examples of using the ternary operator to write concise conditional expressions in Java.</li>
            <li><a href="#IfStatements">IfStatements.java</a>: Examples of using if statements to execute code based on a condition in Java.</li>
            <li><a href="#Simplifying_IF_Statements">Simplifying_IF_Statements.java</a>: Examples of simplifying if statements using logical operators and ternary operators.</li>
        </ul>
        <h2>How to Use</h2>
        <ol>
            <li>
                <strong>Clone the repository:</strong>
                <pre><code>git clone https://github.com/TajwarSaiyeed/programming-with-java</code></pre>
            </li>
            <li>
                <strong>Navigate to the project directory:</strong>
                <pre><code>cd HelloWorld</code></pre>
            </li>
            <li>
                <strong>Compile Java files:</strong>
                <pre><code>javac src/*.java</code></pre>
            </li>
            <li>
                <strong>Run the programs:</strong>
                <p>To run a program, such as <code>ReadInput.java</code>, execute:</p>
                <pre><code>java src/ReadInput</code></pre>
            </li>
            <li>
                <strong>Quick Testing:</strong>
                <p>If you'd like to test a code snippet quickly without setting up a local environment, you can use an online Java compiler such as <a href="https://www.programiz.com/java/online-compiler/">Online Java Compiler</a>.</p>
            </li>
        </ol>
        <h2>About the Code</h2>
        <ul>
            <li>Each file focuses on a specific concept to ensure clarity and easy understanding.</li>
            <li>Comments are included in each file to explain the code and logic.</li>
        </ul>
        <h2>Contributing</h2>
        <p>
            If you find any errors, or have suggestions for improvements, feel free to submit an issue or pull request.
        </p>
        <h2>License</h2>
        <p>
            This project is licensed under the <a href="https://opensource.org/licenses/MIT">MIT License</a> - see the <code>LICENSE</code> file for details.
        </p>
    </div>
</body>
</html>
