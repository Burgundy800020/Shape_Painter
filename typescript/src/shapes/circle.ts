function Circle(rad: number): Shape {
    const radius = rad;
    return {
        computeArea: function (): number {
            return Math.PI * radius * radius;
        }
    }
}4

export { Circle }
