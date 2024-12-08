function Square(sideLength: number): Shape {
    const sideLen : number = sideLength;
    return {
        computeArea: function (): number {
            return sideLen * sideLen;
        }
    }
}

export { Square }