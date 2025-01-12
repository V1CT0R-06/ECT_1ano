import tkinter as tk

def show_graphic():
    # Create a window
    window = tk.Tk()
    window.title("Test Window")
    window.geometry("300x200")

    # Add a label
    label = tk.Label(window, text="This is a test!", font=("Arial", 14))
    label.pack(pady=20)

    # Add a button to close the window
    button = tk.Button(window, text="Close", command=window.destroy)
    button.pack(pady=10)

    # Run the Tkinter event loop
    window.mainloop()

show_graphic()
