import type { RequestHandler } from "./$types"

export const GET: RequestHandler = async () => {
    const data: string = JSON.stringify(null)

    return new Response(data, {
        status: 200,
        headers: {
            "Content-Type": " text/plain",
            "Content-Length": data.length.toString()
        }
    })
}
