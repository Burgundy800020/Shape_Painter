function Rectangle(w: number, h:number): Shape {
    const width : number = w;
    const height : number = h;
    return {
        computeArea: function (): number {
            return width * height;
        }
    }
}

export { Rectangle}
